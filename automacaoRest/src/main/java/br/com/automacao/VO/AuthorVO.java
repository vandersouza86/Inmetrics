package br.com.automacao.VO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorVO {
	
	private Long id;
	
	private Long IDBook;
	
	private String firstName;
	
	private String lastName;

	public AuthorVO(Long id, Long iDBook, String firstName, String lastName) {
		super();
		this.id = id;
		IDBook = iDBook;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public AuthorVO() {
		super();		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIDBook() {
		return IDBook;
	}

	public void setIDBook(Long iDBook) {
		IDBook = iDBook;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IDBook == null) ? 0 : IDBook.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorVO other = (AuthorVO) obj;
		if (IDBook == null) {
			if (other.IDBook != null)
				return false;
		} else if (!IDBook.equals(other.IDBook))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AuthorVO [id=" + id + ", IDBook=" + IDBook + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	
	
		

}
