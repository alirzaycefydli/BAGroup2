package WWSIS.BAGroup2.dao;

import java.util.List;

import WWSIS.BAGroup2.entity.AuthorEntity;

public interface AuthorDao {
    public void create(AuthorEntity authorEntity);
    public AuthorEntity getById(Integer id);
    public List<AuthorEntity> getAll();
}