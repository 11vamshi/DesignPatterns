extremely similar to factory method pattern, abstract factory is a set of factory methods. abstract factory makes use of 
multiple factory methods.

Def - 

provides a interface for creating families of related/ dependent objects without specifying their concrete classes. If u contrast this to related factory method pattern, single difference these two is that the factory method pattern constructs a single object and abstract factory constructs multiple objects. Even though it is technically simple if u think about it,
it is kind of a DInjection. although it might sound simple, but if u start looking out for places where u could apply this, u actually start to realize that its massively powerful. If u internalise the concepts and make use of it in strategic places suddenly your system is a lot more flexible. do not despair even if it is technically very simple it is actually very powerful. let us get in 

Change the uml diagram of factory method pattern to include 2 factory methods say createAnimal and createOwner, with animal and owner return types, that is it, u have 2 related objects. The pattern dictates that only M animal/N owner, i animal/y owner be returned depending on certain requirements.   

say u have developed a system with specific UI components dependent on underlying OS. say X is OK dialog box and y is actual OK button in mac and I and Y are similar in windows OS. 

Refer UML diagram

Can we say, Abstract factory is a factory of multiple factories?
It would have been great if that was the case and I too first thought that this is what it meant. But it seems it was originally intended to be something simpler than that.

Abstract factory describes a factory that creates multiple subtypes of *multiple products*.

While Factory Method describes a factory that creates multiple subtypes of a *single product*.

However, it is indeed possible that some people use the term to describe a factory of factories.

Thank you for the super good question (I should have addressed it in the video) and thanks for watching! :)