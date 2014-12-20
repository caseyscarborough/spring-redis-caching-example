package com.caseyscarborough.spring.redis;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {

  private static final Logger log = Logger.getLogger(UserRepositoryImpl.class);

  @Override
  public User saveUser(Long id) {
    log.debug("Saving user...");
    User user = new User();
    user.setId(id);
    return user;
  }

  @Override
  public User getUser(Long id) {
    log.debug("Retrieving user...");
    User user = new User();
    user.setId(id);
    return user;
  }

  @Override
  public void deleteUser(Long id) {
    log.debug("Deleting user...");
    // delete user
  }
}
