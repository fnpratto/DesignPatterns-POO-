# Design Patterns
The goal is to add basic projects and try to refactor them.

The Design Patterns Catalog:
## Creational
Creational patterns are ones that create objects, rather than having to instantiate objects directly. This gives the program more flexibility in deciding which objects need to be created for a given case.

- [Abstract factory](https://refactoring.guru/es/design-patterns/abstract-factory)  groups object factories that have a common theme.
- [Builder](https://refactoring.guru/es/design-patterns/builder) constructs complex objects by separating construction and representation.
- [Factory method ](https://refactoring.guru/es/design-patterns/factory-method)creates objects without specifying the exact class to create.
- [Prototype ](https://refactoring.guru/es/design-patterns/prototype)creates objects by cloning an existing object.
- [Singleton](https://refactoring.guru/es/design-patterns/singleton) restricts object creation for a class to only one instance.
  
## Structural
Structural patterns concern class and object composition. They use inheritance to compose interfaces and define ways to compose objects to obtain new functionality.

- [Adapter](https://refactoring.guru/es/design-patterns/adapter)  allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
- [Bridge ](https://refactoring.guru/es/design-patterns/bridge)decouples an abstraction from its implementation so that the two can vary independently.
- [Composite](https://refactoring.guru/es/design-patterns/composite) composes zero-or-more similar objects so that they can be manipulated as one object.
- [Decorator](https://refactoring.guru/es/design-patterns/decorator) dynamically adds/overrides behavior in an existing method of an object.
- [Facade](https://refactoring.guru/es/design-patterns/facade) provides a simplified interface to a large body of code.
- [Flyweight](https://refactoring.guru/es/design-patterns/flyweight) reduces the cost of creating and manipulating a large number of similar objects.
- [Proxy](https://refactoring.guru/es/design-patterns/proxy) provides a placeholder for another object to control access, reduce cost, and reduce complexity.

## Behavioral
Most behavioral design patterns are specifically concerned with communication between objects.

- [Chain of responsibility](h) delegates commands to a chain of processing objects.
- [Command](h)creates objects that encapsulate actions and parameters.
- [Interpreter](h) implements a specialized language.
- [Iterator](https://refactoring.guru/es/design-patterns/iterator) accesses the elements of an object sequentially without exposing its underlying representation.
- [Mediator](h) allows loose coupling between classes by being the only class that has detailed knowledge of their methods.
- [Memento](h) provides the ability to restore an object to its previous state (undo).
- [Observer](https://refactoring.guru/es/design-patterns/observer) is a publish/subscribe pattern, which allows a number of observer objects to see an event.
- [State](h) allows an object to alter its behavior when its internal state changes.
- [Strategy](https://refactoring.guru/es/design-patterns/strategy) allows one of a family of algorithms to be selected on-the-fly at runtime.
- [Template method](h) defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
- [Visitor](https://refactoring.guru/es/design-patterns/visitor)  separates an algorithm from an object structure by moving the hierarchy of methods into one object.
