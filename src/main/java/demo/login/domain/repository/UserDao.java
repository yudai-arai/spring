package demo.login.domain.repository;

import demo.login.domain.model.User;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface UserDao {
    //Userテーブルの件数取得
    public int count() throws DataAccessException;

    //1件インサート
    public int insertOne(User user) throws DataAccessException;

    //１件取得
    public User selectOne(String userId) throws DataAccessException;

    //全件取得
    public List<User> selectMany() throws DataAccessException;

    //１件更新
    public int updateOne(User user) throws DataAccessException;

    //１件削除
    public int deleteOne(String userId) throws DataAccessException;

    //取得結果CSV保存
    public void userCsvOut() throws DataAccessException;
}
