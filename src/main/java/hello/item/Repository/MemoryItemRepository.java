package hello.item.Repository;

import hello.item.Domain.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryItemRepository implements ItemRepository{


    // 어딘가 저장할 공간이 필요 -> Map 사용
    private static Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item Detail(Item item) {
        return null;
    }

    @Override
    // 아이템 등록
    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    @Override
    public Optional<Item> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Item> findByName(String name) {
        return store.values().stream().filter(
                member -> member.getName().equals(name)).findAny();
    }
}
