package entities;
// Generated Nov 7, 2017 9:59:36 AM by Hibernate Tools 5.2.5.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * Sysdiagrams generated by hbm2java
 */
@Entity
@Table(name = "sysdiagrams", schema = "dbo", catalog = "SHOP", uniqueConstraints = @UniqueConstraint(columnNames = {
		"principal_id", "name" }))
public class Sysdiagrams implements java.io.Serializable {

	private Integer diagramId;
	private Integer version;
	private Serializable name;
	private int principalId;
	private byte[] definition;

	public Sysdiagrams() {
	}

	public Sysdiagrams(Serializable name, int principalId) {
		this.name = name;
		this.principalId = principalId;
	}

	public Sysdiagrams(Serializable name, int principalId, byte[] definition) {
		this.name = name;
		this.principalId = principalId;
		this.definition = definition;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "diagram_id", unique = true, nullable = false)
	public Integer getDiagramId() {
		return this.diagramId;
	}

	public void setDiagramId(Integer diagramId) {
		this.diagramId = diagramId;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "name", nullable = false)
	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

	@Column(name = "principal_id", nullable = false)
	public int getPrincipalId() {
		return this.principalId;
	}

	public void setPrincipalId(int principalId) {
		this.principalId = principalId;
	}

	@Column(name = "definition")
	public byte[] getDefinition() {
		return this.definition;
	}

	public void setDefinition(byte[] definition) {
		this.definition = definition;
	}

}
