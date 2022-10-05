# ddd-example
this is an application for practical DDD

# Concept of DDD
## Aggregate 
cluster of associated objects that we treat as a unit for the purpose of data changes.
An aggregate which contains an identity will have other entities and access to those entities must pass by the aggregate.
An aggregate defines a transactional boundary. This means any changes to the aggregate will either all succeed or none will succeed.

## Entity
In DDD, an Entity is something that has an identifier and an owner. It can be mutable, but has a thread of continuity throughout its lifetime.

## Value Object
In DDD, a ValueObject is immutable, has no identifier, and is replaceable by another instance of the same ValueObject.

## Command 
In DDD, a command is an object that is sent to the domain for a state change which is handled by a command handler

## Event 
In DDD, a domain event is described as something that happens in the domain and is important to domain experts

## Repository
In DDD, a repository is an objcect that participates in the domain but really abstracts away storage and infrastructure details
