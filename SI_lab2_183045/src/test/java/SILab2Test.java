import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
   private List<String> createUserList(String... elems){
       return new ArrayList<>(Arrays.asList(elems));
   }
   @Test
    void TestEveryStatement(){
       //User=null,allUsers=null vo jazli:1,2,3,4,26
       RuntimeException isklucok;
       isklucok=assertThrows(RuntimeException.class, ()-> SILab2.function(null,null));
       assertTrue(isklucok.getMessage().contains("The user is not instantiated"));
      //User(null,blabla,bla@yahoo.com ) Gi pominuva jazlite:1,2,3,5,6,26
       List<String>lista=createUserList("Matej","Leona");
       isklucok=assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,"blabla","bla@yahoo.com"),lista));
       assertTrue(isklucok.getMessage().contains("The user is missing some mandatory information"));
       //User(Sandra,1sandra,sandra@yahoo.com),allUsers=[User1,User2] ->allUsers moze da bidat bilo koi,1,2,3,5,7,8,9,10,26
       assertEquals(false, SILab2.function(new User("Sandra","1sandra","sandra@yahoo.com"),lista));
       //User(Sandra,1lala,sandra@yahoo.com), allUSers=[User1,User2] ,gi pominuva jazlite:1,2,3,5,7,8,9,11,12,26
       assertEquals(false, SILab2.function(new User("Sandra","1lala","sandra@yahoo.com"),lista));
       //User(Sandra,1lalabla,sandra@yahoo.com,allUSers=[User1,User2] Gi pominuva jazlite:1,2,3,5,,7,8,9,11,13,14,[15.1,15.2,15.3,16,17,18,20,22,]23,24,26
       assertEquals(false, SILab2.function(new User("Sandra","1lalabla","sandra@yahoo.com"),lista));
       //User(SandraStojanovska,1Lalabla*,stojanovska@yahoo.com),allUser=[User1,User2] ,Slucaj koj zaavrsuva validno so return=true
       //Gi pominuva jazlite:1,2 3,5,7,8,9,11,13,14,[15.1,15.2,15.3,16,17,18,19,20,21,22],23,25,26
       assertEquals(true, SILab2.function(new User("Sandra","1Lalabla*","sandra@yahoo.com"),lista));


   }
   @Test
    void MultipleCondition(){
       RuntimeException isklucok;
       //1.	if (user==null) =>Т=User=null,branch =3-4.
       isklucok=assertThrows(RuntimeException.class, ()-> SILab2.function(null,null));
       assertTrue(isklucok.getMessage().contains("The user is not instantiated"));

       //2.	if (user.getUsername()==null || user.getPassword()==null)=>
       //T,T User=User(null,null,sandra@yahoo.com),branch =5-6.
       List<String>lista=createUserList("Helena","Teo");
       isklucok=assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,"sandra@yahoo.com"),lista));
       assertTrue(isklucok.getMessage().contains("The user is missing some mandatory information"));
       // T,F  User=User(null,lozinka1,sandra@yahoo.com),branch =5-6.
       isklucok=assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,"lozinka1","sandra@yahoo.com"),lista));
       assertTrue(isklucok.getMessage().contains("The user is missing some mandatory information"));
       //F,T : User=User(Sandra,null,sandra@yahoo.com),branch =5-6.
       isklucok=assertThrows(RuntimeException.class, ()-> SILab2.function(new User("Sandra",null,"sandra@yahoo.com"),lista));
       assertTrue(isklucok.getMessage().contains("The user is missing some mandatory information"));

      //if (passwordLower.contains(user.getUsername().toLowerCase())) =>
       //T User=User(Sandra,sandra,sandra@yahoo.com),branch =9-10.
       assertEquals(false, SILab2.function(new User("Sandra","sandra","sandra@yahoo.com"),lista));

       //	if (passwordLower.length()<8) =>
       //T User=User(Sandra,1lala,sandra@yahoo.com),branch =11-12.
       assertEquals(false, SILab2.function(new User("Sandra","1lala","sandra@yahoo.com"),lista));
      //	if (!digit || !upper || !special)
      //T,T,T => User=User(Sandra,Lozink1*,sandra@yahoo.com),branch =23-25.
      assertEquals(true, SILab2.function(new User("Sandra","Lozink1*","sandra@yahoo.com"),lista));
      //T,T,F=>  User=User(Sandra,Lozinka1,sandra@yahoo.com),branch =23-24.
      assertEquals(false, SILab2.function(new User("Sandra","Lozinka1","sandra@yahoo.com"),lista));
      //T,F,T=> User=User(Sandra,lozink1*,sandra@yahoo.com),branch =23-24.
      assertEquals(false, SILab2.function(new User("Sandra","lozink1*","sandra@yahoo.com"),lista));
      //F,T,T=>User=User(Sandra,Lozinka*,sandra@yahoo.com),branch =23-24.
      assertEquals(false, SILab2.function(new User("Sandra","Lozinka*","sandra@yahoo.com"),lista));


   }


}
