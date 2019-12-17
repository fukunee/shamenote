package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/10 10:08
 */
public class lc_355 {

    class Message{
        public int messageId;
        public int messageTime;
        public Message next;
        public Message(int messageId, int messageTime){
            this.messageId = messageId;
            this.messageTime = messageTime;
            this.next = null;
        }
    }

    class User{
        int userId;
        Message message;
        HashSet<Integer> followers;
        public User(int userId, HashSet<Integer> followers){
            this.message = null;
            this.userId = userId;
            this.followers = followers;
        }
    }

    class Twitter {
        int timestamp; //时间戳
        HashMap<Integer,User> map;
        /** Initialize your data structure here. */
        public Twitter() {
            this.timestamp = 0;
            this.map = new HashMap<>();
        }

        public void createUser(int userId){
            if(!map.containsKey(userId)) {
                map.put(userId, new User(userId, new HashSet<>()));
                map.get(userId).followers.add(userId);
            }
        }

        /** Compose a new tweet. */
        public void postTweet(int userId, int tweetId) {
            createUser(userId);
            Message cur = new Message(tweetId, timestamp++);
            cur.next = map.get(userId).message;
            map.get(userId).message = cur;
        }

        /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
        public List<Integer> getNewsFeed(int userId) {
            List<Integer> res = new LinkedList<>();
            if(map.containsKey(userId)) {
                PriorityQueue<Message> queue = new PriorityQueue<>(10, (v1, v2) -> Integer.compare(v2.messageTime, v1.messageTime));
                for (Integer follower : map.get(userId).followers) {
                    Message m = map.get(follower).message;
                    if(m != null) queue.offer(m);
                }
                while(!queue.isEmpty() && res.size() < 10) {
                    Message m = queue.poll();
                    res.add(m.messageId);
                    if(m.next != null) queue.offer(m.next);
                }
            }
            return res;
        }

        /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
        public void follow(int followerId, int followeeId) {
            createUser(followerId);
            createUser(followeeId);
            map.get(followerId).followers.add(followeeId);
        }

        /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
        public void unfollow(int followerId, int followeeId) {
            if(followerId != followeeId) {
                this.follow(followerId,followeeId);
                map.get(followerId).followers.remove(followeeId);
            }
        }
    }

}
