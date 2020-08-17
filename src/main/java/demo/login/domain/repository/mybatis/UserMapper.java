package demo.login.domain.repository.mybatis;

import demo.login.domain.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    // 登録用メソッド
    @Insert("INSERT INTO m_user ("
            + " user_id,"
            + " password,"
            + " user_name,"
            + " birthday,"
            + " age,"
            + " marriage,"
            + " role)"
            + " VALUES ("
            + " #{userId},"
            + " #{password},"
            + " #{userName},"
            + " #{birthday},"
            + " #{age},"
            + " #{marriage},"
            + " #{role})")
    public boolean insert(User user);

    // １件検索用メソッド
    @Select("SELECT user_id AS userId,"
            + "password,"
            + "user_name AS userName,"
            + "birthday,"
            + "age,"
            + "marriage,"
            + "role"
            + " FROM m_user"
            + " WHERE user_id = #{userId}")
    public User selectOne(String userId);

    // 全件検索用メソッド
    @Select("SELECT user_id AS userId,"
            + "password,"
            + "user_name AS userName,"
            + "birthday,"
            + "age,"
            + "marriage,"
            + "role"
            + " FROM m_user")
    public List<User> selectMany();

    // １件更新用メソッド
    @Update("UPDATE m_user SET"
            + " password = #{password},"
            + " user_name = #{userName},"
            + " birthday = #{birthday},"
            + " age = #{age},"
            + " marriage = #{marriage}"
            + " WHERE user_id = #{userId}")
    public boolean updateOne(User user);

    // １件削除用メソッド
    @Delete("DELETE FROM m_user WHERE user_id = #{userId}")
    public boolean deleteOne(String userId);
}
