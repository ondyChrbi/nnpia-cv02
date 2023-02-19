package cz.upce.fe.cv02.repository;

import cz.upce.fe.cv02.domain.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {
}
