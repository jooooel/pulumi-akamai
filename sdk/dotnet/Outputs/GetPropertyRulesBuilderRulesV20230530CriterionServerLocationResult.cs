// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230530CriterionServerLocationResult
    {
        public readonly ImmutableArray<string> Continents;
        public readonly ImmutableArray<string> Countries;
        public readonly string? LocationType;
        public readonly bool? Locked;
        public readonly string? MatchOperator;
        public readonly ImmutableArray<string> Regions;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530CriterionServerLocationResult(
            ImmutableArray<string> continents,

            ImmutableArray<string> countries,

            string? locationType,

            bool? locked,

            string? matchOperator,

            ImmutableArray<string> regions,

            string? templateUuid,

            string? uuid)
        {
            Continents = continents;
            Countries = countries;
            LocationType = locationType;
            Locked = locked;
            MatchOperator = matchOperator;
            Regions = regions;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
