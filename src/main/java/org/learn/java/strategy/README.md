
Lets get into it,SP is a super sensible way to start if u r just learning DP. It is actually
probably the simplest pattern if i were to think of it in only a few words, it is about using 
composition rather than inheritance.It is about understanding that inheritance is not intended for 
code reuse, lets checkout the official def. 

Def - 

SP defines a family of algorithms, encapsulates each one and makes them interchangeable. 
Strategy lets the algo vary independently from clients that use it.

WHAT???
when u have a strategy pattern u have a family of algos, and each one of those can be interchangeable
They are claiming that u can plug and play. 
Rational is " Strategy lets the algorithm vary independently from clients that use it. " basically
we decoupled the algorithm from the clients who are using it. whoever is using the algo. is not 
forced to change when you are changing the algo. If u think about an implementation of a collection
for example, an implementation of list, if the list had a sorting algo built into it, you can never 
change the sorting algo but if u are using strategy pattern inject a sorting strategy then the sorting 
atrategy can vary independently from the list. 

Example from Book

Duck super class with quack() and display()

wild duck and city duck is a duck. subclassing duck each having its own display() and thus reusing code.
What is the problem?
The problem is of course that has oftentimes when we talk about DP, it s change, when requirements change   
over time, our current design may not necessarily be appropriate for the incoming reqs, 
lets say we have new method fly() in duck class, this example is ofc fictitious and silly but then 
they are saying that new reqs come in and some programmer forgets that we are doing this and then we have a new subclass rubber duck, now their argument is that rubberducks should not be flying, we cant just blindly inherit
behaviour. 

so what if we then, 
I am sought of treading off from where they are going but i think we are going to serve the same place, so what if then we are saying that let us implement fly() as well here, and it is essentially nothing, it is non flying
so u could argue that not being able to fly is a kind of flying behaviour. we will get more into that and this 
too actually works fine but you can may b start to get this feeling that we are sought of heading down a slippery slope, so let us say that we have a anothr duck, i will make up silly names , never mind, name is 
just a thing, we have lots of ducks,

let us say we have mountain duck, names make no sense whatever, moutain duck also has its own fly()
behaviour, let's say that this flying behaviour is not not being ablle to fly but a different kind of flying 
behaviour. another duck lets say cloud duck that has its own flying behaviour but what is interesting is that this guy has muntain duck's flying behaviour.

u can just start to say OK well i need another class flyingWithStyleA and both of these inherit form this class
But hopefully you are feeling that now we are really treading down a dangerous path, cuz yes that works for
fly, I am running out of space here but what if we also have eat() in parent class for eg right, and cloudDuck has its own eat method different from mountain duck,        

Now it is getting kind of crazy, it works as long as behavior is shared downwards. consider an inheritence 
hierarchy, as soon as u want to share behavior horizontally, there is no way, unless u get into multiple
inheritance, sandy metz says it nicely, when she says that the solution to problems with inheritance is
not more inheritance, but that is a topic for another discussion. but i think my analogy makes sense, u choose
ofcourse there are many ways of building these hierarchies. many ways of building up inheritance chain, but essentially the point is that no matter how u do it, there are some scenarios where u cant build it hierarchically,  cuz u will end up with a situation where some behavior needs to be shared horizontally.
u either have to duplicate code or find another solution. BTW sandy metz has a really great talk on amongst
other things the null object pattern where she talks a bit about this . ill link that in desc and it is 
super valuable, and that gives more insight into why composition often be favoured over inheritance.


Result  - 
27:10 in tp the video
These are no longer named subclasses in the system, they are a particular configuration of instances of 
behaviors so given a combo of different strategies we happen to call some of these combos different 
things. so 

if it flies in aparticular way, quacks in a particular way, displayed in a particular way
(although we did not implement it here) we call that a wild duck.  

if it quacks in the different way, flies in a different way, we call it different duck, what i have not talked 
about, i sort of glanced over it, is DInjection, that is only possible if these behaviors are somehow injected 
into an instance of a duck and not hard-coded in the class,

 
32:30

SO u pass in a behavior and then u execute that behavior in the class, so now ducks vary independently or 
how any particular fly/quack behavior actually vary.




 

   








 

  
   