package elmoukhantar.yass.saccount.dto;

import elmoukhantar.yass.saccount.entity.Accountbank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Accountrepository extends JpaRepository<Accountbank,Long> {
}
