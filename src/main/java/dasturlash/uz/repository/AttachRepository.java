package dasturlash.uz.repository;


import dasturlash.uz.entity.AttachEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttachRepository extends JpaRepository<AttachEntity, String> {

}