Def -
 
Design Patterns are not just about how you string objects together but also the intent. here we r trying to solve specific set of problems related to security
provides a surrogate or placeholder for another obj. to control access to it.

3 intents/types/versions/styles exist are 3 different things.
1. remote proxy - lets u to access a remote resource, a diff. server, namespace, project
2. virtual - controls access to resource that is expense to create (may b cache)
3. protection - makes sure only users that are allowed based on access rights

adds additional behaviour similar to decorator but with the intent of controlling
access to the underlying object. 

virtual - imagine a String book that contains entire string representation as
string ( point is string is huge )

BookParser bp = new BookParser(book);  
bp.noOfPages()
bp.noOfChapters()

and many other methods are provided to give properties or some calculations

"Thanks for making this very good series, I am thoroughly enjoying all the videos and I have actually purchased the book because of them! The quote you are looking for at 11:00 sounds like it might be Meyer's Uniform Access principle: "All services offered by a module should be available through a uniform notation, which does not betray whether they are implemented through storage or through computation". You can read about it here "


since these methods are all pre-computed by parser, calling them is cheap but not the initialization of bp.  

pre-mature optimization states dont try to increase the performance of app.
when you have not yet faced any issue, don't waste time.
  

now coming back lets say we faced performance issue now, then we see it as opportunity, we can stick a book proxy between who ever calls a bookParser
and thus creating expensive objs on demand rather than immediately. 

Hence this is different from decorator cuz here proxy is responsible for creating actual object (controlling access of course) where as in decorator u create the actual object and pass it to decorator


  
