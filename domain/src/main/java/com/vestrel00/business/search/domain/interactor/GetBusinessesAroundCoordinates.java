/*
 * Copyright 2017 Vandolf Estrellado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vestrel00.business.search.domain.interactor;

import com.vestrel00.business.search.domain.Business;
import com.vestrel00.business.search.domain.Coordinates;
import com.vestrel00.business.search.domain.repository.BusinessRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Use case for getting businesses around the given coordinates.
 */
public final class GetBusinessesAroundCoordinates implements SingleUseCase<Coordinates, List<Business>> {

    private final BusinessRepository businessRepository;

    @Inject
    public GetBusinessesAroundCoordinates(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    @Override
    public Single<List<Business>> execute(Coordinates coordinates) {
        return businessRepository.aroundCoordinates(coordinates);
    }
}
