package io.springoneplatform8.webapp;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Region("Messages")
class Message {

	@Id
	private Long id;
	private String userName;
	private String messageText;
    private Date creationDateTime;

}
