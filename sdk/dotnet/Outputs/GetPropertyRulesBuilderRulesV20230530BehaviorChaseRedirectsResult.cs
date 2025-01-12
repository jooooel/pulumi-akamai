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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorChaseRedirectsResult
    {
        public readonly bool? Enabled;
        public readonly string? Limit;
        public readonly bool? Locked;
        public readonly bool? Serve404;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorChaseRedirectsResult(
            bool? enabled,

            string? limit,

            bool? locked,

            bool? serve404,

            string? templateUuid,

            string? uuid)
        {
            Enabled = enabled;
            Limit = limit;
            Locked = locked;
            Serve404 = serve404;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
