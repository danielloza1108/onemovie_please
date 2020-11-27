package com.onemovieplease.onemovie_please.dao;

import com.onemovieplease.onemovie_please.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<User,Long> {
    User findByEmail(String email);
    @Query(value = "SELECT friends_id from user_friends where user_id =:id",
            nativeQuery = true)
    List<Long> findFriends(@Param("id") Long id);
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO user_friends (user_id,friends_id) VALUES (:u_id,:f_id)",
            nativeQuery = true)
    void addFriend(@Param("u_id") Long u_id, @Param("f_id") Long f_id);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM user_friends WHERE user_id =:u_id AND friends_id =:f_id",
            nativeQuery = true)
    void removeFriend(Long u_id, Long f_id);
}
