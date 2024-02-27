package com.gmail.zavsek.o2;

interface Obstacle {
    boolean overcome(Participant participant);
}

class Track implements Obstacle {
    private final double length;

    public Track(double length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant instanceof Human) {
            if (length <= 1000) {
                participant.run();
                System.out.println("Human " + ((Human) participant).name +
                        " has overcome the track of length " + length);
                return true;
            } else {
                System.out.println("Human " + ((Human) participant).name +
                        " has failed to overcome the track of length " + length);
                return false;
            }
        } else if (participant instanceof Cat) {
            if (length <= 500) {
                participant.run();
                System.out.println("Cat " + ((Cat) participant).name +
                        " has overcome the track of length " + length);
                return true;
            } else {
                System.out.println("Cat " + ((Cat) participant).name +
                        " has failed to overcome the track of length " + length);
                return false;
            }
        } else if (participant instanceof Robot) {
            if (length <= 2000) {
                participant.run();
                System.out.println("Robot " + ((Robot) participant).name +
                        " has overcome the track of length " + length);
                return true;
            } else {
                System.out.println("Robot " + ((Robot) participant).name +
                        " has failed to overcome the track of length " + length);
                return false;
            }
        }
        return false;
    }
}

class Wall implements Obstacle {
    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant instanceof Human) {
            if (height <= 2) {
                participant.jump();
                System.out.println("Human " + ((Human) participant).name +
                        " has overcome the wall of height " + height);
                return true;
            } else {
                System.out.println("Human " + ((Human) participant).name +
                        " has failed to overcome the wall of height " + height);
                return false;
            }
        } else if (participant instanceof Cat) {
            if (height <= 1) {
                participant.jump();
                System.out.println("Cat " + ((Cat) participant).name +
                        " has overcome the wall of height " + height);
                return true;
            } else {
                System.out.println("Cat " + ((Cat) participant).name +
                        " has failed to overcome the wall of height " + height);
                return false;
            }
        } else if (participant instanceof Robot) {
            if (height <= 3) {
                participant.jump();
                System.out.println("Robot " + ((Robot) participant).name +
                        " has overcome the wall of height " + height);
                return true;
            } else {
                System.out.println("Robot " + ((Robot) participant).name +
                        " has failed to overcome the wall of height " + height);
                return false;
            }
        }
        return false;
    }
}