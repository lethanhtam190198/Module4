package ex.music.repository;

import ex.music.model.Music;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MusicRepositoryImpl implements IMusicRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = entityManager.createQuery("SELECT s FROM music s", Music.class);
        return query.getResultList();
    }

    @Override
    public void save(Music music) {
        entityManager.persist(music);
    }

    @Override
    public void remove(int id) {
        entityManager.remove(id);
    }

    @Override
    public void update( Music music) {
        entityManager.merge(music);
    }

    @Override
    public Music findById(int id) {
        return entityManager.find(Music.class,id);
    }
}

//        for (int i=0 ;i<productList.size();i++) {
//        if (productList.get(i).getId() == id) {
//        productList.remove(productList.get(i));
//        }
//        }