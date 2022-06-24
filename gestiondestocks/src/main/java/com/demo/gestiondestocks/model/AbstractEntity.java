package com.demo.gestiondestocks.model;

import java.io.Serializable;
import java.time.Instant;
/*import java.util.Date;*/
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
/*import org.springframework.data.annotation.LastModifiedBy;*/
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable{

    @Id
    @GeneratedValue
    private Integer id;
    @CreatedDate
    @Column(name = "creationDate", nullable = false)
    @JsonIgnore
    private Instant createDate;
    @LastModifiedDate
    @Column(name = "lastModifyDate" , nullable = false)
    @JsonIgnore
    private Instant lastModifyDate;


}
