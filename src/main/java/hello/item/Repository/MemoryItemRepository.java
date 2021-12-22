package hello.item.Repository;

import hello.item.Domain.Item;

import java.util.List;
import java.util.Optional;

public class MemoryItemRepository implements ItemRepository{

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item Detail(Item item) {
        return null;
    }

    @Override
    public Item save(Item item) {
        return null;
    }

    @Override
    public Optional<Item> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Item> findByName(String name) {
        return Optional.empty();
    }
}
