package fi.zcode.jenkins.repository;

import fi.zcode.jenkins.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
