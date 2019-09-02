package me.lesonnnn.assignmentthree.model;

public class User {
    private int mId;
    private int mImage;
    private String mName;
    private String mBirthday;
    private float mRating;

    public User(int id, int image, String name, String birthday, float rating) {
        mId = id;
        mImage = image;
        mName = name;
        mBirthday = birthday;
        mRating = rating;
    }

    public int getImage() {
        return mImage;
    }

    public static class UserBuilder {
        private int mId;
        private int mImage;
        private String mName;
        private String mBirthday;
        private float mRating;

        public UserBuilder() {
        }

        public UserBuilder id(int id) {
            this.mId = id;
            return this;
        }

        public UserBuilder image(int image) {
            this.mImage = image;
            return this;
        }

        public UserBuilder name(String name) {
            this.mName = name;
            return this;
        }

        public UserBuilder birthday(String birthday) {
            this.mBirthday = birthday;
            return this;
        }

        public UserBuilder rating(float rating) {
            this.mRating = rating;
            return this;
        }

        public User build() {
            User user =
                    new User(this.mId, this.mImage, this.mName, this.mBirthday,
                            this.mRating);
            return user;
        }
    }
}
