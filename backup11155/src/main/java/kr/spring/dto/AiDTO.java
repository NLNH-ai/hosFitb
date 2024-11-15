package kr.spring.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import kr.spring.entity.Visit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AiDTO {
	
	
	
    private String chartNum;
    
    private Long id;
    private float level1;
    private float level2;
    private float level3;
    
	public AiDTO(float level1, float level2, float level3) {
	    this.level1 = level1;
	    this.level2 = level2;
	    this.level3 = level3;
	}
    
	public void setVisit(Visit visit) {
		// TODO Auto-generated method stub
		
	}
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}



}

