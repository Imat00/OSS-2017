package linListe;

public interface LinListe {
  public LinListe erzeugeLeereListe();
  public LinListe vorh�ngen(Object obj);
  public boolean isEmpty();
  public Object head() throws IstLeerException;
  public LinListe tail() throws IstLeerException;

}
