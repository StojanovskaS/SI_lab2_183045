	Група на Код: 3

	Control Graph Flow за функција која проверува дали лозинката на корисникот е валидна 

Овој граф го добив така што:
Јазел 1 е почетокот на функцијата т.е влезот во неа ,а 2 е декларирање и дефинирање на променливата specialCharacters. Овие два јазли се извршуваат при секој повик на функцијата function и се извршуваат еден по друг секогаш така што ги ставам во еден јазол.Јазол 3 е услов кој проверува дали Објектот од класата User не постои т.е е null .Доколку условот е исполнет оди во јазол 4 кој фрла исклучок "The user is not instantiated" ,па програмата оди директно во јазол 26.т.е јазол 26 е јазол кој ми означува крај на програмата.Доколку условот 3 не е исполнет одиме во јазол 5 кој повторно е услов кој проверува дали лозинката и корисничкото име се внесени ,доколку барем еден од нив, или лозинката или корисничкото име не се внесени се исполнува условот и програмата оди во јазол 6 кој преставува повторно фрлање исклучок The user is missing some mandatory information и повторно програмата оди директно во јазол 26.Доколку условот од јазол 5 не е исполнет тогаш програмата продолжува во јазлите 7,8,9 кои 7 е дефинирање на лозинката т.е password,8 е дефинирање на passwordLower ,а 9 е услов кој проверува дали лозинката го содржи името на корисникот односно (лозинката претворена во мали букви дали го содржи името на корисникот исто со мали букви).Доколку услов 9 е исполнет преминуваме во јазол 10 кој преставува завршување негативно на програмата (return false) и кој потоа оди во јазол 26.Доколку овој услов не исполнет програмата оди во друг јазол-услов 11 кој ја проверува должината на лозинката,доколку е помала од 8 карактери ,програмата оди во јазол 12. Кој враќа false и оди во 26 јазолот.Доколку не е исполнет ни овој услов оди во else дел т.е јазол 13,со јазол 14 кој преставува само дефинирање на променливите digit, upper, special.Од таму профолжува во јамка која јас ја преставив како јазол 15 разделен во три дела 15.1 дефинирање на променливата I, 15.2 услов дали бројот на карактерот кој се разгледува е помал од големината на лозинката ,и услов 15.3 кој го зголемува бројачот i .
По преминот на програмата од 15.1 во 15.2 оди во јазол 16. Кој преставува услов кој проверува дали карактерот кој го разгледуваме е број ,доколку е исполнет оди во јазол 17 кој ја поставува променливата digit на true ,но во овој дел и доколку условот е исполнет и доколку не е т.е јазол 16 секогаш и 16 и 17 одат во јазол 18 кој преставува услов кој проверува дали карактерот е голема букава ,доколку е преминува во јазол 19 кој ја поставува променливата upper на true ,и исто као во претходниот случај и 19 и 18 одат во јазол 20 кој е услов кој проверува дали карактерот што се разгледува сега е некој од специјалните знаци дефинирани со јазол 2. Доколку карактерот е специјален знак програмата оди во јазол 21. Кој ја поставува променливата special на true ,и овде и двата јазли и неисполнетиот услов од 20 и 21 одат во јазол 15.3.А 15.3 оди во јазол 15.2.Доколку 15.2 не се исполни тогаш одиме во јазол 22 кој преставува крај на јамката. Јазол 22 продолжува во јазол 23 кој преставува услов кој проверува дали некоја од променливите digit, upper I special е не добила вредност true,доколку овој услов е задоволен програмата оди во јазол 24 кој враќа false за функцијата и кој оди во јазол 26.Доколку не е исполнет усовот т.е јазолот 23 оди во јазол 25 кој враќа true и оди во јазол 26.

	Цикломатска комплексност:

Број на ребра=32
Број на јазли=24
Цикломатска комплексност=32-24+2=10
Доколку ги бројам регионте повторно добивам 10,и на третиот начин добив 10 т.е 9 предикатни јазли+1=10.


	Основните тест случаи кои ги имам според критериумот Every Statement се:

•	Тест случај во кој немаме предадено кориснички објект на функцијата,па во јазол 4 фрла исклучок.И завршува со јазол 26.

•	Тест случај во кој објекот User кој го предаваме на функцијата нема username или password ,па и во овој случај се фрла исклучок од програмата т.е јазол 6 и завршување на програмата во јазол 26.

•	Тест случај во кој корисничкото име се содржи во лозинката на корисникот.И во овој случај програмата фрла повторно исклучок (јазол 10) и завршува.

•	Тест случај во кој лозинката на корисникот има помалку карактери од бараните 8.Програмата завршува со фрлање на исклучок во јазолот 12 т.е оди директно кај 26.

•	Тест случај во кој имаме објект кој ги задоволува сите претходни барања ,но има лозика во која има само мали букви и еден број (случај кој јас го разгледувам во табелата,но може да биде комбинација од трите услови кои ги имаме во јамката т.е да немаме голема буква или да немаме број или да немаме специјален карактер во лозинката) ,во овој случај се увидува дека доколку барем еден од условите во јамката не е исполнет тогаш лозинката нема да биде валидна т.е влегува во условот кај јазолот 23 и завршува со 24 јазолот и 26 т.е крајот на функцијата.

•	Тест случај во кој username ,password се валидни т.е лозинката не го содржи корисничкото име,има повеќе од 8 карактери и ги задоволува условите да има вклучено специјални знаци,бројки и големи букви.

Тест сценарио кое ми ги опфаќа сите овие услови кои ги опшав е:
1.User=null,allUsers=null Влегува во следниве јазли:1,2,3,4,26

2. User(null,blabla,bla@yahoo.com),allUsers=[User1,USer2] Влегува во :1,2,3,5,6,26

3. User(Sandra,1sandra,sandra@yahoo.com),allUsers=[User1,User2] 
Влегува во: 1,2,3,5,7,8,9,10,26

4. User(Sandra,1lala,sandra@yahoo.com), allUSers=[User1,User2]
Влегува во : 1,2,3,5,7,8,9,11,12,26

5. User(Sandra,1lalabla,sandra@yahoo.com,allUSers=[User1,User2]
Влегува во :1,2,3,5,,7,8,9,11,13,14,15.1,15.2,15.3,16,17,18,20,22,23,24,26

6.User(SandraStojanovska,1Lalabla*,stojanovska@yahoo.com),allUser=[User1,User2] Влегува во:1,2 3,5,7,8,9,11,13,14,15.1,15.2,15.3,16,17,18,19,20,21,22,23,25,26.

Во прилог ја имате csv датотеката во која е означена целата постапка .




	Тест случаи според критериумот Multiple Condition се наоѓаат така што ги разгледувам гранките кои поврзуваат јазол услов со јазол исход .

Јазли кои се услови во мојот control flow graph за оваа задача се:3,5,9,11,15,16,18,20,23.
Гранки кои ги формираат, во однос на исходот true/false се:
3-5;3-4;5-6;5-7;9-10;9-11;11-12;11-13,14;15-16;15-22;16-17;16-18;18-19;18-20;20-21;20-15.3;23-24;23-25.

Тест случаи за исполнување на сите услови:
1.	if (user==null) =>
Т= Тест Случај : User=null (да немае објект од класата Корисник),гранка =3-4.
F= Тест Случај : User=User(Sandra,1sandra,sandra@yahoo.com),гранка =3-5.

2.	if (user.getUsername()==null || user.getPassword()==null)=>
T,T Тест Случај : User=User(null,null,sandra@yahoo.com),гранка =5-6.
T,F Тест Случај : User=User(null,lozinka1,sandra@yahoo.com),гранка =5-6.
F,T Тест Случај : User=User(Sandra,null,sandra@yahoo.com),гранка =5-6.
F,F Тест Случај :User=User(Sandra,lozinka1,sandra@yahoo.com),гранка =5-7.

3.	if (passwordLower.contains(user.getUsername().toLowerCase())) =>
T Тест Случај : User=User(Sandra,sandra,sandra@yahoo.com),гранка =9-10.
F Тест Случај : User=User(Sandra,lozinka1,sandra@yahoo.com),гранка =9-11.

4.	if (passwordLower.length()<8) =>
T Тест Случај : User=User(Sandra,1lala,sandra@yahoo.com),гранка =11-12.
F Тест Случај : User=User(Sandra,lozinka1,sandra@yahoo.com),гранка =11-13.

5.	 if (i<password.length()) =>
Поради тоа што 15.2 е дел од јамка и се рагледува само бројот на карактери што останува во секоја итерација од лозинката.Да го рагледаме User=User(Sandra,lozinka1,sandra@yahoo.com),
T Тест Случај :  Кога i=0 ,а password.length()=8  и во сите наредни 7 итерации ќе биде true condition, гранка=15.2-16.
F Тест Случај : Кога i=8 ,a и password.length()=8 , гранка=15.2-2.

6.	if (Character.isDigit(password.charAt(i)))
T Тест Случај : User=User(Sandra,lozinka1,sandra@yahoo.com),гранка =16-17.
F Тест Случај : User=User(Sandra,lozinkaа,sandra@yahoo.com),гранка =16-18.

7.	if (Character.isUpperCase(password.charAt(i))) =:
T Тест Случај : User=User(Sandra,Lozinka1,sandra@yahoo.com),гранка =18-19.
F Тест Случај : User=User(Sandra,lozinka1,sandra@yahoo.com),гранка =18-20.

8.	if (specialCharacters.contains(String.valueOf(password.charAt(i))))
T Тест Случај : User=User(Sandra,lozinka*,sandra@yahoo.com),гранка =20-21.
F Тест Случај : User=User(Sandra,lozinka1,sandra@yahoo.com),гранка =20-15.3.

9.	if (!digit || !upper || !special)
T,T,T => Тест Случај : User=User(Sandra,Lozink1*,sandra@yahoo.com),гранка =23-25.

T,T,F=> Тест Случај : User=User(Sandra,Lozinka1,sandra@yahoo.com),гранка =23-24.

T,F,T=> Тест Случај : User=User(Sandra,lozink1*,sandra@yahoo.com),гранка =23-24.

F,T,T=> Тест Случај : User=User(Sandra,Lozinka*,sandra@yahoo.com),гранка =23-24.

F,F,F=> Тест Случај : User=User(Sandra,lozinkaa,sandra@yahoo.com),гранка =23-24.

F,F,T=> Тест Случај : User=User(Sandra,lozinka*,sandra@yahoo.com),гранка =23-24.

F,T,F=> Тест Случај : User=User(Sandra,Lozinkaa,sandra@yahoo.com),гранка =23-24.

T,F,F=> Тест Случај : User=User(Sandra,lozinka1,sandra@yahoo.com),гранка =23-24.


	Unit тестовите во Gradle :
ги направив со тоа што креирав класа во src/test/java и потоа ги имлементирав во две посебни функции т.е тестови, еден за Every Statement ,а другиот за Multiple Condition .Во двата теста ги користев од библиотекатa org.junit.jupiter.api.Assertions assertEquals и assertThrows со assertTrue.




