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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorStrictHeaderParsingResult
    {
        public readonly bool? Locked;
        public readonly bool? StrictMode;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;
        public readonly bool? ValidMode;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorStrictHeaderParsingResult(
            bool? locked,

            bool? strictMode,

            string? templateUuid,

            string? uuid,

            bool? validMode)
        {
            Locked = locked;
            StrictMode = strictMode;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            ValidMode = validMode;
        }
    }
}