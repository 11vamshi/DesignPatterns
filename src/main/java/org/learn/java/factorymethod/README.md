book talks about 3 kinds 
1 simple factory                  = is said not to be a design pattern and chris agrees
2 factory method				  = in this video
3 abstract factory				  = in next video

factory method
why? we have plenty of objs in our code. when we talked about strategy pattern, u could argue that what we were doing is 
programming by wishful thinking. we were using Dinjection to achieve that but even to do that we need to construct the 
dependencies. factory method now comes into picture, in situations were instantiation is a complex task with processing involved. It is also about polymorphism. Say u have a super class A and subclasses B,C,D. and factory is responsible for 
holding the logic of creation of particular shared type say A in this case and created is B/C/D. If u have 2 factors, they both create the same thing but in a different way. 

Say u have a random animal factory which creates dog/cat/duck which are sub-types of animal and and we call create Animal method from factory whose output is not known in advance but depends on the logic in this method.
Intent is this method will randomly create any of the sub types. Let us think about other creation factory that we talked about. say we also have balanced animal factory with same signature but it also has say a state due to which it does not randomly create animals but balances their creation, say in this use-case, if it already returns dog, it removes dog from next lottery and only outputs animal from cat/duck. To summarize, upon every third creation we have number of all there animals in case of balanced factory and but random factory will converge towards the same over time. since both are factories we can specify a common interface animalfactory with createAnimal() method.          

This is it. let us look at def in the book.
Factory Method pattern defines an interface for creating an object but lets subclasses decide which classes to instantiate.factory method lets the class defer instantiation to subclasses. let us dig through this. interface in this case is not literal programming interface but a contract (could be an interface/superclass). 


Now u have factory pattern which people call it as when u have only 1 factory where as in this case we had 2 factories and a supertype. 


another example, say u have a game with 5 levels and each level produces asteroids with a specific size and velocity. This is possible only when u define good abstractions and parameterize them in good way, u suddenly need fewer types,  u turn types into properties just as in strategy pattern and move away from class explosion with fewer classes.  	  













    