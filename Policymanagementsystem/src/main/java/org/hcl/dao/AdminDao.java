package org.hcl.dao;

import org.hcl.entities.Admin;

public interface AdminDao {

	Integer insert(Admin a);

	Integer validate(Integer ad_id, String ad_pw);
}
