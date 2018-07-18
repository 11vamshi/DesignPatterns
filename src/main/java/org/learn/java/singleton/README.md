shortest video in this series buz it is time to talk about singleton 

before we start the video, i really want to stress that many people argue that this pattern is a code smell.u should not actually ever use this pattern. I fact is as i currently stand I am one of these people, i will only cover it for the sake of completion. 

Def - 

ensures the class has only 1 instance and provides a global point of access to it. 

main critiques are

when u actually start programming, first things we learnt, is to avoid globals. it is to actually scope variables and functions so that no everything is leaking into the global namespace. for one, it is extremely difficult to control cuz u have lots of different things that might be ambiguous out of context or might be difficult to understand out of context. probably more importantly whenever u leak something to the global namespace, whenever something is globally accessible, that thing might change without u knowing it. it is much harder to program when u dont have control. it is like programming 101 which says globals are bad. 

second thing is making sure u only have single instance, that too is sought of an absurd idea, if u think about it, that is an assumption.u r assuming that in the future i will ever ever need a single instance of the class. which might not be true if ur application is growing everyday. 

Take building a chat app for instance, u might first think that chat is singleton, u might be able to reference the chat in which users are from wherever in the program. to make it convenient for yourself, u make a singleton and have a global point of access to this instance of the chat but then as time progresses u start to realize that actually we r being very successful with this chat and we want to have multiple chat rooms. If the singlton chat is managing users who are currently connected to the chat, that is essentially  a chat room. So I would argue that we never know that if we only need a single instance of class which we never know.

Great saying , one man's constant is another man's variable. profound and speaks to the dangers of singleton. 

steps
1 create private constructor
2 create static access method(static since we made constructor private and we cant create the method from outside if we dont want to create instance from outside), which creates new instance in its body inside the class.
3 create private static Singleton variable, to prevent access to it from outside, static cuz only then we can access it from static access method.  






 	        