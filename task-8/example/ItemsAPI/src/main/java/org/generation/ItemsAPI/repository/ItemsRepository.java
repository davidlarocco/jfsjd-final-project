package org.generation.ItemsAPI.repository;

import org.generation.ItemsAPI.repository.entity.Item;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface ItemsRepository extends CrudRepository<Item, Integer>
{
}