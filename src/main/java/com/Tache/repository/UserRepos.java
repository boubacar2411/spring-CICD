package com.Tache.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Tache.Enum.Statut;
import com.Tache.entity.Tache;
import com.Tache.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@RepositoryRestResource
public interface UserRepos extends JpaRepository<User, Long>{

}
   

