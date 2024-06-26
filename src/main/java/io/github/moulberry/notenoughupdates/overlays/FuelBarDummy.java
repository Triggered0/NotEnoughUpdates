/*
 * Copyright (C) 2022-2023 NotEnoughUpdates contributors
 *
 * This file is part of NotEnoughUpdates.
 *
 * NotEnoughUpdates is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * NotEnoughUpdates is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with NotEnoughUpdates. If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.overlays;

import io.github.moulberry.notenoughupdates.NotEnoughUpdates;
import io.github.moulberry.notenoughupdates.core.config.Position;
import io.github.moulberry.notenoughupdates.core.config.GuiPositionEditor;
import org.lwjgl.util.vector.Vector2f;

import java.util.List;
import java.util.function.Supplier;

public class FuelBarDummy extends TextOverlay {
	public FuelBarDummy(
		Position position,
		Supplier<List<String>> dummyStrings,
		Supplier<TextOverlayStyle> styleSupplier
	) {
		super(position, dummyStrings, styleSupplier);
	}

	@Override
	public boolean isEnabled() {
		GuiPositionEditor.renderDrill = NotEnoughUpdates.INSTANCE.config.mining.drillFuelBar;
		return NotEnoughUpdates.INSTANCE.config.mining.drillFuelBar;
	}

	@Override
	public void update() {

	}

	@Override
	public Vector2f getDummySize() {
		return new Vector2f(NotEnoughUpdates.INSTANCE.config.mining.drillFuelBarWidth + 2, 12);
	}
}
