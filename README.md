Exercise 1 UML link: https://ggcedu-my.sharepoint.com/:u:/g/personal/dsisongregory_ggc_edu/EfByADW4ZoZHqdRcC7EKc_wB1Jmf1uEVut_mjSxZkQSVZw?e=hKeOed

![image](https://github.com/DakotaSisGreg/Chapter3HW/assets/156225388/a860973e-e4b9-4bd9-b212-acd1bb0b813e)


The farm application and its associated packages, as discussed, are designed to model various farm animals and their behaviors. 
FarmAnimal Superclass: Represents the generic concept of a farm animal. It includes common attributes such as name, gender, weight, and age that are shared across different types of farm animals. This class provides a foundational structure from which specific animal classes can inherit; essentially this class will define what a "Farm animal" is.

Chicken, Cow, and Duck Subclasses: These are examples of specific animal types that extend the FarmAnimal superclass. Each of these classes can have unique attributes and behaviors. For example, a sound attribute was discussed for Chicken, Cow, and Duck, representing the noises these animals can make.

MyFarm : The MyFarm application aims to model and simulate a variety of farm animal behaviors


Exercise 2 UML link: https://ggcedu-my.sharepoint.com/:u:/g/personal/dsisongregory_ggc_edu/EWxraK43ECRNgnDSX2DYd58BPuMSSRvarL-2zvXRQZiWlQ?e=6tUfcW

![image](https://github.com/DakotaSisGreg/Chapter3HW/assets/156225388/4843060d-3099-43be-882b-6485375ca226)


Flight Interface: Represents the ability to fly but does not specify how the action is performed, leaving the implementation details to the concrete classes.

Airplane Class: The fly() method for an airplane prints a message indicating that it relies on engines to fly. The class also includes getters and setters for its attributes and a toString() method for a formatted output of the airplane's details

Bird Class: implements the Flight interface, representing a bird with a "type" attribute (e.g., "Eagle", "Hummingbird"). The fly() method for a bird prints a message about flapping wings to fly. Similar to Airplane, it has a getter and setter for its type and a toString() method that outputs the bird's details


Exercise 3 UML link: https://ggcedu-my.sharepoint.com/:u:/g/personal/dsisongregory_ggc_edu/EUP9Y4r_bLNHr2nm_VnEmE8B0lm_mCa0yYxuTuC6oN3q-w?e=30mfur

![image](https://github.com/DakotaSisGreg/Chapter3HW/assets/156225388/f465c833-ee17-4b5c-baf2-cc54a17720e9)


Flight Interface: Remains as defined in Exercise 2, with the fly() method for flying behavior.

Movement Interface: new interface extends Flight, adding two additional abstract methods, walk() and jump(), to introduce walking and jumping behaviors

Airplane Class: Updated to implement the Movement interface. While it retains its original attributes (model and year) and the flying capability, it also includes implementations for walk()

Bird Class: updated to implement the Movement interface, adding natural implementations for walk() and jump() to its behavior, in addition to flying.
