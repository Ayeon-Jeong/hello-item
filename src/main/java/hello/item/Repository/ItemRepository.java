package hello.item.Repository;

import hello.item.Domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    List<Item> findAll();
    Item Detail(Item item);
    Item save(Item item);
    Optional<Item> findById(Long id);
    Optional<Item> findByName(String name);

}
