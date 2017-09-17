package com.srisris.tapasya.springjersey;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ToDo")
public class ToDo {

	@Id
	private String id;
	private String summary;
	private String description;
	private String dateCreated;

	public ToDo() {
	}

	public ToDo(String summary, String description, String dateCreated) {

		this.summary = summary;
		this.description = description;
		this.dateCreated = dateCreated;
	}
	
	

	public String getId() {
		return id;
	}

	public String getSummary() {
		return summary;
	}

	public String getDescription() {
		return description;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return String.format("ToDo[id=%s, summary='%s', description='%s' , dateCreated='%s']", id, summary, description,
				dateCreated);
	}

}
