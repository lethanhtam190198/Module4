package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int positionId;

    private String positionName;

    @OneToMany(mappedBy = "positionId", cascade = CascadeType.ALL)
    private Set<Position> positions;

    public Position() {
    }

    public Position(int positionId, String positionName, Set<Position> positions) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.positions = positions;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Set<Position> getPositions() {
        return positions;
    }

    public void setPositions(Set<Position> positions) {
        this.positions = positions;
    }
}
