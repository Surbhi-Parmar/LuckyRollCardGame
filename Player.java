/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author surbhi parmar, 2020
 */

package ca.sheridancollege.project;
public class Player implements Comparable<Player>
{
       
        public Player(int id)
        {
                this.playerId = id;
        }

        private int playerId;

        private String  playerName;

        private int points;

        private String result;

        public int getPlayerId()
        {
                return playerId;
        }

        public void setPlayerId(int playerId)
        {
                this.playerId = playerId;
        }

        public String getPlayerName()
        {
                return playerName;
        }

        public void setPlayerName(String playerName)
        {
                this.playerName = playerName;
        }

        public int getPoints()
        {
                return points;
        }

        public void setPoints(int points)
        {
                this.points = points;
        }

        public String getResult()
        {
                return result;
        }

        public void setResult(String result)
        {
                this.result = result;
        }

        @Override
        public int hashCode()
        {
                final int prime = 31;
                int result = 1;
                result = prime * result + playerId;
                return result;
        }

        @Override
        public boolean equals(Object obj)
        {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Player other = (Player) obj;
                if (playerId != other.playerId)
                        return false;
                return true;
        }

        @Override
        public int compareTo(Player o)
        {
                if (this.getPoints() == o.getPoints())
                {
                        return 0;
                }
                else if (this.getPoints() > o.getPoints())
                {
                        return 1;
                }
                else
                        return -1;
        }
}
