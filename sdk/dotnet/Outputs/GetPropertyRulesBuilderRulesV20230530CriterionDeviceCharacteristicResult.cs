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
    public sealed class GetPropertyRulesBuilderRulesV20230530CriterionDeviceCharacteristicResult
    {
        public readonly bool? BooleanValue;
        public readonly string? Characteristic;
        public readonly bool? Locked;
        public readonly bool? MatchCaseSensitive;
        public readonly bool? MatchWildcard;
        public readonly string? NumericMatchOperator;
        public readonly int? NumericValue;
        public readonly string? StringMatchOperator;
        public readonly ImmutableArray<string> StringValues;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;
        public readonly string? VersionMatchOperator;
        public readonly string? VersionValue;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530CriterionDeviceCharacteristicResult(
            bool? booleanValue,

            string? characteristic,

            bool? locked,

            bool? matchCaseSensitive,

            bool? matchWildcard,

            string? numericMatchOperator,

            int? numericValue,

            string? stringMatchOperator,

            ImmutableArray<string> stringValues,

            string? templateUuid,

            string? uuid,

            string? versionMatchOperator,

            string? versionValue)
        {
            BooleanValue = booleanValue;
            Characteristic = characteristic;
            Locked = locked;
            MatchCaseSensitive = matchCaseSensitive;
            MatchWildcard = matchWildcard;
            NumericMatchOperator = numericMatchOperator;
            NumericValue = numericValue;
            StringMatchOperator = stringMatchOperator;
            StringValues = stringValues;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            VersionMatchOperator = versionMatchOperator;
            VersionValue = versionValue;
        }
    }
}