package com.caseyscarborough.spring.redis;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public interface UserRepository {

  /**
   * The User that is saved from this method will be stored in the
   * cache and referenced by its' ID.
   */
  @CachePut("users")
  public User saveUser(Long id);

  /**
   * This method should never actually be executed, since the User will
   * always be retrieved from the cached output of saveUser.
   */
  @Cacheable("users")
  public User getUser(Long id);

  /**
   * When this method is called, the cached User will be deleted from
   * the cache.
   */
  @CacheEvict("users")
  public void deleteUser(Long id);
}