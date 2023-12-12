package com.paymybuddy.paymybuddy.entites;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


@Entity
@Table(name = "friend_connections")
public class FriendConnections {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer connectionId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "friendId")
    private Users friend;

    public Integer getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Integer connectionId) {
        this.connectionId = connectionId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Users getFriend() {
        return friend;
    }

    public void setFriend(Users friend) {
        this.friend = friend;
    }
}
