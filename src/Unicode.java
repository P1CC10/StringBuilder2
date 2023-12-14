public class Unicode {
    private String inputString;
    private int position;

    public Unicode(String inputString, int position) {
        this.inputString = inputString;
        this.position = position;
    }

    public String getUnicodeCharacter() {
        try {
            // Controlla se l'indice è valido
            if (position >= 0 && position < inputString.length()) {
                // Ottieni il carattere in Unicode
                char character = inputString.charAt(position);
                return "Il carattere in Unicode all'indice " + position + " è: " + Integer.toHexString(character | 0x10000).substring(1);
            } else {
                // Indice non valido
                return "Errore: Indice non valido.";
            }
        } catch (Exception e) {
            // Gestisci altre eccezioni
            return "Errore: " + e.getMessage();
        }
    }
}

