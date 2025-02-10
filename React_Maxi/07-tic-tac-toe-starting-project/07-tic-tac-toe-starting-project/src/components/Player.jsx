import { useState } from "react";

export default function Player({initialName, symbol}) {

    const [ playerName, setPlayerName ] = useState(initialName);

    const [ isEditing, setIsEditing ] = useState(false);

    let editablePlayerName = <span className="player-name">{playerName}</span>;
    let buttonCaption = 'Edit';

    if (isEditing) {
        // playerName = <input type="text" required defaultValue={name} />;
        editablePlayerName = <input type="text" required value={playerName} onChange={handleChange} />;
        // 2-way binding...
    }

    function handleChange(event) {
        console.log(event);
        setPlayerName(event.target.value);
    }

    function handleEditClick() {
        // react's recomended best practice
        setIsEditing((editing) => !editing);    // *** best practice: react schedules these state update functions
        // editing holds the old state value
    }

    return (
        <li>
            <span className="player">
                {editablePlayerName}
                <span className="player-symbol">{symbol}</span>
            </span>
            <button onClick={handleEditClick}>{isEditing ? "Save" : "Edit"}</button>
        </li>
    );
}