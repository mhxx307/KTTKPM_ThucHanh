package com.example.spring_boot_api_jwt_ad.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_role")
@Getter
@Setter
public class Role extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "role_key")
	private String roleKey;

	@OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable(name = "t_role_permission", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = {
			@JoinColumn(name = "permission_id") })
	private Set<Permission> permissions = new HashSet<>();

	public Role() {
		super();
	}

	public Role(String roleName, String roleKey, Set<Permission> permissions) {
		super();
		this.roleName = roleName;
		this.roleKey = roleKey;
		this.permissions = permissions;
	}

//	public Role(String roleName, String roleKey) {
//		super();
//		this.roleName = roleName;
//		this.roleKey = roleKey;
//		permissions = new HashSet<Permission>();
//	}

//	public void addPermisstions(String permissionName, String permissionKey) {
//		Permission permission = new Permission(permissionName, permissionKey);
//		permissions.add(permission);
//	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleKey() {
		return roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

}
