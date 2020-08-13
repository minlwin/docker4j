package com.jdc.location.api.dto;

import java.util.List;

import com.jdc.location.model.entity.Division;
import com.jdc.location.model.entity.Township;

import lombok.Data;

@Data
public class Location {

	private Division division;
	private List<Township> townships;
}
