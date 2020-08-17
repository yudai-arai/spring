package demo.login.domain.service.mybatis;

import demo.login.domain.model.User;
import demo.login.domain.service.RestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("ResrServiceMybatisImpl")
public class RestServiceMybatisImpl implements RestService {
    @Override
    public boolean insert(User user) {
        return false;
    }

    @Override
    public User selectOne(String userId) {
        return null;
    }

    @Override
    public List<User> selectMany() {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(String userId) {
        return false;
    }
}
