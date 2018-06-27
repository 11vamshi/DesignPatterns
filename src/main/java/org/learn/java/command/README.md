Def -

The command pattern encapsulates a request as an object thereby letting you parameterize other objects with 
different requests queue or log requests and support undoable operations.



Icommand interface does not need any dependencies

Command class constructor needs to be passed all the dependencies to perform action on dependency

22.37 in to the video

It is not complex, that is not the point, it is not that we are wrapping a complex action, it could be exactly 
this simple( turning the light on), the point is not that we're encapsulating sth that is complex, the
point is we're encapsulating sth that is potentially trivial so that we can pass it around, If u think about 
functional programming, functions are first class citizens so it is trivial to take some procedure and 
wrap that in a function and pass that function around, command pattern kind of gives us this flexibility 
OO programming, so wrap some action tht we want to perform this.light.On in this case, so wrap that into a 
class and then if u instantiate that class then u can suddenly pass around this object, as if it was a function 
contained in a variable as the execute method, then we have the unexecute which is essentially the inverse 
of it. 



Key point - we might have multiple concrete commands, also not have multiple concrete commands, again we might do this even if we have a single concrete command, just so that we are able to sort of batch the execution 
of this command and this is why in the book they were talking about queues for eg, u might construct 
commands and put them in the queue so that u can execute them 1 by 1 by 1 or in batches right, let us say we
have an expensive operation, you want to batch them, 

lastly we see invoker
keeps track of commands, this is not necessarily a part of the pattern, ICommand and Command are key part   
of the pattern which might lok strategy pattern you may wonder what is actually the diff. I would guess 
probably the only difference is the intent, like here we are treating the strategies as commands, 

Invoker just like Receiver is specific to the scenario you are 0perating. In your scenario you might have 
multiple invokers that have different interfaces, such as TV remote and AC Remote with different interfaces
and with regards to this pattern they dont necessarily need to share an ancestor. but they need to support
the adding of ICommands, depending of your scenario it might make sense to share a common ancestor, so that
u could treat them the same way, such as in this dude's case Light remote had 4 commands and TV remote
had 7 commands to function sensibly.  

So the notion is we load them with same commands , even though the invokers have completely different 
interfaces, so that u could use same software in your phone program both of these devices 


36:00 
keypoint is at runtime you can vary these commands, if u are building an app, when use presses this particular 
button, i want this particular series of commands to be executed, u can then give user a bunch of
different commands, let the user choose which command should be coupled to which button, or which command 
should be put on to which button, so that when the user presses that button u actually execute that command, 

1. undoing becomes super easy cuz every command now has an unexecute method, 
2. u can now construct macro commands, 

In case of photoshop, u have series of undo options to a long way and programatically to implement it 
u can use command pattern to simpliy it.




 


	



  













