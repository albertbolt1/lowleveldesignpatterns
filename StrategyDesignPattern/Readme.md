Strategy design pattern

this is helpful in reducing redundancy and making the code reusable 

Lets say we have different Vehicles:
1) Ford
2) Tesla 
3) Suzuki 
etc

and each one of these has a drive option which tells us 
if it drives fat or slow or medium.

Instead of creating a drive method in each class which
will tell if it drives slow or fast or medium 

we can put that information into a strategy

We create a interface for the strategy make classes of different 
speeds.

The classes can have a strategy associated with them. 

This reduces the burden of creating a drive function for every]
new vehicle that we add