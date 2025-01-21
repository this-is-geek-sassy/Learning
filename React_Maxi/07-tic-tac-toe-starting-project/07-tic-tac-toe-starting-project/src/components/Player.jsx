import { useState } from "react";

export default function Player({name, symbol}) {

    const [ isEditing, setIsEditing ] = useState(false);

    let playerName = <span className="player-name">{name}</span>;
    let buttonCaption = 'Edit';

    if (isEditing) {
        playerName = <input type="text" required value={name} />;
    }

    function handleEditClick() {
        // react's recomended best practice
        setIsEditing((editing) => !editing);    // react schedules these state update functions
        // editing holds the old state value
    }

    return (
        <li>
            <span className="player">
                {playerName}
                <span className="player-symbol">{symbol}</span>
            </span>
            <button onClick={handleEditClick}>{isEditing ? "Save" : "Edit"}</button>
        </li>
    );
}